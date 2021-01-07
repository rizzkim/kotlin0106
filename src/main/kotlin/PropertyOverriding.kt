open class PropertySuper{
    open val msg : String = "rizz"
}

class PropertySub : PropertySuper(){
    //프로퍼티 오버라이딩
    //val -> val, var
    //var -> var
    override val msg : String = "레이먼"
}