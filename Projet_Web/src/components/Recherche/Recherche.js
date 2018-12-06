import React from 'react'
import PropTypes from 'prop-types'
import Rule from '../Rule'


class Recherche extends React.Component {

  state = {test: 'de'}

  static propTypes = {
    rules: PropTypes.array,
    loadUpdateRules: PropTypes.func,
    name: PropTypes.string,
    test: PropTypes.string,
  
  }

  static defaultProps = {
    rules: [],
  }



  componentDidMount = () => {
    this.props.loadUpdateRules()
    
  }

  /*updateChange = e => this.setState({ name: e.target.value });*/
  updateRule = e => this.setState({test: [e.target.value]})
  
  /*updateRule(event) {
    const recup = event.target.value;
    this.setState({test: recup})
    
    
  }*/



  handleChange(event) {
    
    /*let change = {}
    change[event.target.name] = event.target.value
    return change*/
    /*const { rules } = this.props
    let change = {}
    change[event.target.name] = event.target.value
    return rules.map(rule => <Rule key={change} rule={rule} />)*/
    //console.log(change)
    
    /*const { rules } = this.props
    const test = rules.map(rule => <Rule key={rule.id} rule={rule} />)
    return event.props (
      console.log(test)
    )*/

    /*let change = {}
    change[event.target.name] = event.target.value
    console.log(change)*/
/*
    const { rules } = this.props
    rules.forEach(function(element) {
      
    }*/
    
    

    /*this.props.loadUpdateRules()*/
    /*return (
      
      return rules.map(rule => <Rule key={rule.id} rule={rule} />)
    )*/

    /*rules.forEach(function(element) {
      console.log(element)
    });*/

  }
  

  /*render() {
    const { rules } = this.props
    return rules.map(rule => <Rule key={rule.id} rule={rule} />)
  }*/

  render() {
    //const { rules } = this.props
    //return rules.map(rule => <Rule key={rule.id} rule={rule} />)
    //return rules.map(rule => console.log(rule.id))
    //const { rules1 } = this.state
    
    /*const { rules } = this.props
    rules.forEach(function(rule) {*/
      //console.log(rule.title)
      /*const testef = (<Rule title={rule.title} />)
      console.log(testef.title)*/
      
      /*if (rule.title == this.test){
        this.setState({rules: rule})
        console.log('title : ' + rule.title +'test :'+  this.test + 'rules : ' + rules)
      } */
    //});
    const { rules } = this.props
    
 
    
    return (

      /*<div className="navbar-brand brand" >
      <input type="text" placeholder="Rechercher" onChange={Recherche.updateRule} />
      { <button id="submit" onClick={this.onSubmitClick}>Entrer</button>}
   </div>*/
   
      rules.map(rule => <Rule key={rule.id} style={`${rule.title === this.state.test ? console.log(rule.title)  : console.log(rule.getState) }`} rule={rule} />) 
    )
    
  }
}


export default Recherche