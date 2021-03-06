import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { WelcomeModule } from './app/welcome/welcome.module';
import { environment } from './environments/environment';
import { AppModule } from './app/app.module';

if (environment.production) {
  enableProdMode();
}

platformBrowserDynamic().bootstrapModule(WelcomeModule)
  .catch(err => console.error(err));

  //platformBrowserDynamic().bootstrapModule(AppModule)
  //.catch(err => console.error(err));
