import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { PromiseComponent } from './promise/promise.component';
import { ObservableComponent } from './observable/observable.component';
import { CallbackComponent } from './callback/callback.component';
import { FromEventComponent } from './observable/from-event/from-event.component';
import { AllComponent } from './observable/all/all.component';
import { IntervalComponent } from './observable/interval/interval.component';
import { TimerComponent } from './observable/timer/timer.component';
import { OfComponent } from './observable/of/of.component';
import { FromComponent } from './observable/from/from.component';
import { ToArrayComponent } from './observable/to-array/to-array.component';
import { CustomObservableComponent } from './observable/custom-observable/custom-observable.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    PromiseComponent,
    ObservableComponent,
    CallbackComponent,
    AllComponent,
    // rxjs components
    FromEventComponent,
    IntervalComponent,
    TimerComponent,
    OfComponent,
    FromComponent,
    ToArrayComponent,
    CustomObservableComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
