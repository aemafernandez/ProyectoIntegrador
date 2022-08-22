import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoArPrComponent } from './components/logo-ar-pr/logo-ar-pr.component';
import { RedesComponent } from './components/redes/redes.component';
import { BanerComponent } from './components/baner/baner.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoArPrComponent,
    RedesComponent,
    BanerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
