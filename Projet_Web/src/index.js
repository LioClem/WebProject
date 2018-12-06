import React from 'react'
import ReactDOM from 'react-dom'
import { Provider } from 'react-redux'
import { BrowserRouter, Route } from 'react-router-dom'
import 'bootstrap/dist/css/bootstrap.css'
import './index.css'
// import App from './App'
import registerServiceWorker from './registerServiceWorker'
import Layout from './components/Layout'
import store from './store'

ReactDOM.render(
  <Provider store={store}>
    <BrowserRouter>
      <Route path="/" component={Layout} />
    </BrowserRouter>
  </Provider>,
  document.getElementById('root'),
)
registerServiceWorker()

/*ReactDOM.render(
  <Provider store={store}>
    <RuleList />
  </Provider>,
  document.getElementById('root'),
)*/

/*const reactElement = React.createElement('div', null, 'Hello World');
const domElement = document.getElementById('root');

console.log('rules = ', rules);

ReactDOM.render(reactElement, domElement);*/

//ReactDOM.render(<RuleList rules={rules}/>, document.getElementById('root'));


