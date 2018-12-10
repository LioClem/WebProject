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
        <li className="active"><Link to="/">Créer une soirée</Link></li>
        <li><Link to="/new">Consulte tes soirées</Link></li>
        <li><Link to="/evenement">Modifie tes soirées</Link></li>
        <li><Link to="/restaurant">Les restos</Link></li>
        <li><Link to="/new">Supprime tes soirées</Link></li>
      </ul>
    </div>
  
  </nav>

)





export default Header