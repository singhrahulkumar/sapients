
function mergeSortedArray(arr1,arr2){
  let arr = [],point1=0,point2=0,i=0;
  while(point1<arr1.length && point2<arr2.length){
    if(arr1[point1] < arr2[point2]){
      arr[i] = arr1[point1];
      point1++;
      i++
    } else{
      arr[i] = arr2[point2];
      point2++;
      i++
    }
  }
  
  while(point1<arr1.length){
    arr[i] = arr1[point1];
    point1++;
    i++
  }
  
    while(point2<arr2.length){
    arr[i] = arr2[point2];
    point2++;
    i++
  }
  console.log(arr);
}

let arr1 = [1,3,5,7,9];
let arr2 = [2,4,8,10,11,12,14,16];
mergeSortedArray(arr1,arr2);