import React from 'react'
import ReactDOM from 'react-dom'
import { BrowserRouter, Route } from 'react-router-dom'
import 'bootstrap/dist/css/bootstrap.css'
import './index.css'
// import App from './App'
import * as serviceWorker from './serviceWorker'
import Layout from './components/Layout'

ReactDOM.render(
    <BrowserRouter>
      <Route path="/" component={Layout} />
    </BrowserRouter>,
  document.getElementById('root'),
)
serviceWorker.unregister();
