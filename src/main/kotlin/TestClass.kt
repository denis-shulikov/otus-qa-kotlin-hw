import kotlin.reflect.full.declaredFunctions

class TestClass<T : BaseTest> : TestRunner<T> {

    override fun runTest(steps: T, test: () -> Unit) {
        steps::class.declaredFunctions.forEach {
            if (it.name.startsWith("before")) {
                it.call(steps)
            }
        }
        test()
        steps::class.declaredFunctions.forEach {
            if (it.name.startsWith("after")) {
                it.call(steps)
            }
        }
    }


}