import { createStore, combineReducers, applyMiddleware, compose } from 'redux'
import thunkMiddleware from 'redux-thunk'
import { reducer as form } from 'redux-form'
import rules from './reducers/rules'

const reducer = combineReducers({
  rules,
  form,
})

const middlewares = [thunkMiddleware]

const enhancers = compose(
  applyMiddleware(...middlewares),
  window.__REDUX_DEVTOOLS_EXTENSION__ && window.__REDUX_DEVTOOLS_EXTENSION__(),
)

const store = createStore(reducer, enhancers)

export default store