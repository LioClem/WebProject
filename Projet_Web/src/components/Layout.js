import React from 'react'
import { Route } from 'react-router-dom'
import Header from './Header'
import AjoutSoiree from './AjoutSoireeForm'
import ConsulteSoiree from './ConsulteSoiree'
import Evenement from './Evenement'
import Restaurant from './Restaurant'

const Layout = () => (
  <div>
    <Header />    
    <div className="container-fluid">
      <div className="container">
      <Route exact path="/" component={AjoutSoiree} />
      
        <Route exact path="/new" component={ConsulteSoiree} />
        <Route exact path="/evenement" component={Evenement} />
        <Route exact path="/restaurant" component={Restaurant} />
      </div>
    </div>
  </div>
)


export default Layout