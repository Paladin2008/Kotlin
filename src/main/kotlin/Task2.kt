fun main() {

    val worker = 50
    val manyWorkers = 30000

    val newWorker = 30
    val manyNewWorkers = 20000

    val sumManyWorker = manyWorkers * worker
    val sumManyNewWorker = manyNewWorkers * newWorker
    val sumManyAll = sumManyWorker + sumManyNewWorker
    val allWorker = worker + newWorker
    val mediumMany = sumManyAll / allWorker

    println("Расходы на выплату зарплат постоянных сотрудников $sumManyWorker")
    println("Общие расходы на зарплаты $sumManyAll")
    println("Средняя зарплат одного сотрудника $mediumMany")
}