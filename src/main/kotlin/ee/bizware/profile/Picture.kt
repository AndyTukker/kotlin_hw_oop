package ee.bizware.profile

class Picture constructor(
    val fileName: String
    //на входе только имя файла
) {
    //TODO должна выполняться проверка существования файла
    //TODO и считываение его размеров
    val height: Int = fileName.length * 20
    val width: Int  = height/2
}