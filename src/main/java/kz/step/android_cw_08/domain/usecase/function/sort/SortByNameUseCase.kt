package kz.step.android_cw_08.domain.usecase.funtion.sort

class SortByNameUseCase (var list: MutableList<Student>){
    init {
        _list = list
    }

    fun Sort(): MutableList<Student>{
        return _list.sortBy {it.firstName}
    }

}