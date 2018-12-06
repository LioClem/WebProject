import React from 'react'
import "../style.css";

const ConsulteSoiree = () => (
  <div>
    <h1 className="ajoutSoiree">Ajoute ta soirée : </h1>
    <form className="ajoutSoiree">
      <div>
        <label>
          Nom :
    <input type="text" name="nom" className="input"/>
        </label>
      </div>
      <div>
        <label>
          Date :
          <input type="text" name="date" className="input" />
        </label>
      </div>
      <div>
        <label>
          Heure de début :
          <input type="text" name="heureDeb" className="input" />
        </label>
        <label>
          Heure de fin :
          <input type="text" name="heureFin" className="input"/>
        </label>
      </div>
      <div>
        <h2>Ton événement : </h2>
      </div>
      <div>
        <h2>Ton restaurant : </h2>
      </div>
    </form>
  </div>
)


export default ConsulteSoiree