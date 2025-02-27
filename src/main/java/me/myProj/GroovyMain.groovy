package me.myProj

static def countDigits(list) {
    def map = [:]
    list.each { int_ ->
        map[int_] = map.getOrDefault(int_, 0) + 1
    }

    return map
}

static def main(args) {
    def list = [1, 3, 4, 5, 1, 5, 4, 1, 2, 4, 5, 3, 6]
    println("$list" + " -> " + countDigits(list))
}