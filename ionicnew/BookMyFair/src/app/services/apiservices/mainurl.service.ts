import { Injectable } from "@angular/core";

@Injectable()
export class MainUrlService
{
    url:string="http://gsmktg.azurewebsites.net:80/api/v1/organizers";
    
    getURL()
    {
        return this.url;
    }
    setURL(url)
    {
        this.url=url;
    }
}