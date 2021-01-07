class Outer{
    var name:String="noname"
    //클래스 안에 존재하는 클래스라서 Nested Class
    inner class Inner{
        fun method() {
            println("내부 클래스의 매소드")
            println("${name}")
        }
    }
}

//익명 클래스
class AnonymousOuter{
    //내부 익명 클래스
    //외부에서 접근하기 위해서 private추가
    //외부에서 접근할 것이 아니라면 private은 필요 없음
    private val anonymousClass=object{
        fun innerMethod(){}
    }

    fun outerMethod(){
        anonymousClass.innerMethod()
    }
}

class CompanionOuter{
    companion object static{
        fun method(){
            println("static 메소드처럼 사용")
        }
    }
}

fun main(){
    //내부 클래스의 인스턴스 만들기
    //inner Class 인 경우는 외부 클래스의 인스턴스를 통해 생성해야 합니다.
    val innerObj=Outer().Inner()
    innerObj.method()

    CompanionOuter.static.method()
}