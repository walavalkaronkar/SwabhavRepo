import { Component, ViewChild } from "@angular/core";
import { StorageService } from 'src/app/services/storage.service';
import { UtilityService } from 'src/app/services/utility.service';
import { MenuController } from '@ionic/angular';
import { EventsService } from 'src/app/services/apiservices/events.service';
import { IonSlides } from '@ionic/angular';
import { TicketsService } from 'src/app/services/apiservices/tickets.service';
import { Router } from '@angular/router';

@Component({
    selector: 'home',
    templateUrl: './home.component.html',
    styleUrls: ['home.component.scss'],
})

export class HomeComponent {
    eventsDetails: any;
    isDataAvaliable: boolean = false;
    image: any;
    allEvents: any;
    sliderOne: any;
    imageContainer = {
        url: ""
    };
    displayMenu: boolean = false;
    visitorsDetails;

    @ViewChild('slideWithNav') slideWithNav: IonSlides;

    constructor(private storageService: StorageService, private utiltyService: UtilityService, private menu: MenuController,
        private eventsService: EventsService, private ticketsService: TicketsService, private router: Router) {
        this.utiltyService.Loader();
        this.getMenusDetails();
        this.eventsDetails = storageService.getEventsDetails();
        //utiltyService.log(this.eventsDetails);
        this.getBanners();
        this.sliderOne = {
            isBeginningSlide: true,
            isEndSlide: false,
            slidesItems: []
        };
    }
    ngOnInit(): void {


    }


    profile() {
        this.router.navigate(['/profile']);
        this.menu.close();
    }

    getBanners() {
        this.allEvents =
            this.eventsService.getBanners()
                .then((result) => {
                    this.allEvents = result;
                    console.log(result[0].bannerImage)
                    this.imageContainer.url = result[0].bannerImage;
                    this.sliderOne.slidesItems.push(this.imageContainer);
                    console.log(this.allEvents);
                    this.isDataAvaliable = true;
                    this.utiltyService.dismiss();

                })
                .catch((error) => {
                    this.utiltyService.dismiss();
                    (error);
                })

    }

    getMenusDetails() {
        this.visitorsDetails = this.storageService.getVisitorDetails();
        this.displayMenu = true;
    }


    bookTickets() {
        this.router.navigateByUrl('/showtickets')
        this.ticketsService.showEventsTickets();

    }

    //Configuration for each Slider
    slideOptsOne = {
        initialSlide: 0,
        slidesPerView: 1,
        autoplay: true
    };


    slideNext(object, slideView) {
        slideView.slideNext(500).then(() => {
            this.checkIfNavDisabled(object, slideView);
        });
    }

    //Move to previous slide
    slidePrev(object, slideView) {
        slideView.slidePrev(500).then(() => {
            this.checkIfNavDisabled(object, slideView);
        });;
    }

    //Method called when slide is changed by drag or navigation
    SlideDidChange(object, slideView) {
        this.checkIfNavDisabled(object, slideView);
    }

    //Call methods to check if slide is first or last to enable disbale navigation  
    checkIfNavDisabled(object, slideView) {
        this.checkisBeginning(object, slideView);
        this.checkisEnd(object, slideView);
    }

    checkisBeginning(object, slideView) {
        slideView.isBeginning().then((istrue) => {
            object.isBeginningSlide = istrue;
        });
    }
    checkisEnd(object, slideView) {
        slideView.isEnd().then((istrue) => {
            object.isEndSlide = istrue;
        });
    }
}