import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CallbackComponent } from './callback/callback.component';
import { PromiseComponent } from './promise/promise.component';
import { ObservableComponent } from './observable/observable.component';
import { AllComponent } from './observable/all/all.component';
import { FromEventComponent } from './observable/from-event/from-event.component';
import { IntervalComponent } from './observable/interval/interval.component';
import { TimerComponent } from './observable/timer/timer.component';
import { OfComponent } from './observable/of/of.component';
import { FromComponent } from './observable/from/from.component';
import { ToArrayComponent } from './observable/to-array/to-array.component';
import { CustomObservableComponent } from './observable/custom-observable/custom-observable.component';


const routes: Routes = [
  {path: 'callback', component: CallbackComponent},
  {path: 'promise', component: PromiseComponent},
  {path: 'observable', component: ObservableComponent, children: [
    // {path: 'all', component: AllComponent},
    {path: '', component: AllComponent},
    {path: 'fromEvent', component: FromEventComponent},
    {path: 'interval', component: IntervalComponent},
    {path: 'timer', component: TimerComponent},
    {path: 'of', component: OfComponent},
    {path: 'from', component: FromComponent},
    {path: 'toArray', component: ToArrayComponent},
    {path: 'custom', component: CustomObservableComponent}
  ]},
  {path: '**', redirectTo: 'callback'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
