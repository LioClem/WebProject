

class RuleDescriptionField extends Component {

    render() {
        return (
            <div class="panel-body">
                <form>
                    <div class="form-group">
                        <label for="rule-title">Title</label>
                        <input type="text" class="form-control" id="rule-title" placeholder="Title" />
                    </div>
                    <div class="form-group">
                        <label for="rule-desc">Description</label>
                        <textarea class="form-control" id="rule-desc" placeholder="Description" />
                    </div>
                    <button type="submit" class="btn btn-primary pull-right">Submit</button>
                </form>
            </div>
        );
    }
}
