import React from 'react'
import "../style.css";

const AjoutSoireeForm = () => (
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
        <h2>Choisis ton événement : </h2>
      </div>
      <div>
        <h2>Choisis ton restaurant : </h2>
      </div>
      <input type="submit" value="Valider" className="button-valider" />
    </form>
  </div>
)


export default AjoutSoireeForm