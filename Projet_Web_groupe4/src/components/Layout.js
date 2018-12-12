import React from 'react'
import { Route } from 'react-router-dom'
import Header from './Header'
import AjoutSoiree from './AjoutSoireeForm'
import ConsulteSoiree from './ConsulteSoiree'
import SupprimerSoiree from './SupprimerSoiree'
import ModifierSoiree from './ModifierSoiree'
import ListeSoiree from './ListeSoiree'

const Layout = () => (
  <div>
    <Header />    
    <div className="container-fluid">
      <div className="container">
      <Route exact path="/" component={AjoutSoiree} />
        <Route exact path="/consult" component={ConsulteSoiree} />
        <Route exact path="/update" component={ModifierSoiree} />
        <Route exact path="/delete" component={SupprimerSoiree} />
        <Route exact path="/list" component={ListeSoiree} />
      </div>
    </div>
  </div>
)

export default Layout