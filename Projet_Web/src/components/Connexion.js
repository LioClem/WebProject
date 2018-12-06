import React from 'react'
import "../style.css";

const Connexion = () => (
    <div>
        <h1 className="ajoutSoiree">Ajoute ta soirée : </h1>
        <form className="ajoutSoiree">
            <div>
                <label>
                    Utilisateur :
    <input type="text" name="nom" className="user" />
                </label>
            </div>
            <div>
                <label>
                    Mot de passe :
          <input type="text" name="date" className="mdp" />
                </label>
            </div>
            <input type="submit" value="Valider" className="button-valider" />
        </form>
    </div>
)


export default Connexion