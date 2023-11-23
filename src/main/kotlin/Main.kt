fun main() {

    val base = BaseTest()
    val test = TestClass<BaseTest>()

    fun primaryTest() {
        println("primaryTest started")
        println("primaryTest finished")
    }

    test.runTest(base) { primaryTest() }
}
