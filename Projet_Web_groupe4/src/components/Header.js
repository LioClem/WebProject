import React from 'react'
import { Link } from 'react-router-dom'
import "../style.css";


const Header = () => (
  <nav className="navbar navbar-default">
  <h1 className="titleSite">Créer tes soirées !</h1>
    <div className="navbar-header">
      <button type="button" className="navbar-toggle">
        <span className="sr-only">Toggle navigation</span>
        <span className="icon-bar" />
        <span className="icon-bar" />
        <span className="icon-bar" />
      </button>
      <a className="navbar-brand brand">Options :</a>
    </div>

    <div className="collapse navbar-collapse">
      <ul className="nav navbar-nav">
        <li className="selected"><Link to="/">Créer une soirée</Link></li>
        <li><Link to="/consult">Consulte tes soirées</Link></li>
        <li><Link to="/update">Modifie tes soirées</Link></li>
        <li><Link to="/delete">Supprime tes soirées</Link></li>
        <li><Link to="/list">Liste tes soirées</Link></li>
      </ul>
    </div>
  
  </nav>

)





export default Header