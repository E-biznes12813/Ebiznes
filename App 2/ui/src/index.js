import React, {Fragment} from 'react';
import ReactDOM from 'react-dom';
import registerServiceWorker from './registerServiceWorker';
import { BrowserRouter, Route } from 'react-router-dom';


import './index.css';

import Home from "./Pages/Home"
import addCategory from "./Pages/addCategory"
import addProduct from "./Pages/addProduct"
import koszyk from "./Pages/koszyk"
import zamowienie from "./Pages/zamowienie"
import komentarze from "./Pages/komentarze"




ReactDOM.render(
    <BrowserRouter>
        <Fragment>
            <Route exact path="/" component={Home}/>
            <Route exact path="/addCategory" component={addCategory}/>
            <Route exact path="/addProduct" component={addProduct}/>
            <Route exact path="/koszyk" component={koszyk}/>
            <Route exact path="/zamowienie" component={zamowienie}/>
            <Route exact path="/komentarze/:id" component={komentarze}/>
        </Fragment>
    </BrowserRouter>
    
, document.getElementById('root'));
registerServiceWorker();
