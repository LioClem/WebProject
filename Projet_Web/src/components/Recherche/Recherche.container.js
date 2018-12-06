import { connect } from 'react-redux'
import { updateRuleList } from '../../store/actions/rules'
import Recherche from './Recherche'
import { rulesLoaded } from '../../store/actions/rules'

const mapStateToProps = state => ({
  rules: state.rules,
})

const mapDispatchToProps = dispatch => ({
  loadUpdateRules: () => dispatch(rulesLoaded()),
  //loadRules: () => dispatch(rulesLoaded()),
})

export default connect(
  mapStateToProps,
  mapDispatchToProps,
)(Recherche)