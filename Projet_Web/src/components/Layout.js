import React from 'react'
import { Route } from 'react-router-dom'
import Header from './Header'
import RuleList from './RuleList'
import AjoutSoiree from './AjoutSoireeForm'
import ConsulteSoiree from './ConsulteSoiree'
import Evenement from './Evenement'


const Layout = () => (
  <div>
    <Header />
    <RuleList />
    
    <div className="container-fluid">
      <div className="container">
      <Route exact path="/" component={AjoutSoiree} />
      
        <Route exact path="/new" component={ConsulteSoiree} />
        <Route exact path="/evenement" component={Evenement} />
      </div>
    </div>
  </div>
)


export default Layout