import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }
data class Duration(val type:TimeInterval, val number:Int)

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate {
    return addTimeIntervals(timeInterval, 1)
}

operator fun MyDate.plus(duration: Duration): MyDate {
    return addTimeIntervals(duration.type, duration.number)
}

operator fun TimeInterval.times(times: Int): Duration {
    return Duration(this, times)
}

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}