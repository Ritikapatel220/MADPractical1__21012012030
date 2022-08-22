fun main(){
    var a = arrayOf(6,5,4,3,2,1)
    var temp = 0
    for (i in 0..a.size-1){
        if(temp<a[i]){
            temp=a[i]
        }
    }
    print("largest value=$temp")
}
