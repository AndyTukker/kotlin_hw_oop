package ee.bizware.hiearchy.view

class ViewGroup(): View() {
    var view: View? = null
    fun addView(newView: View){
        this.view=newView
    }
}