function bubbleSort(arr){
  for(let i =0;i< arr.length;i++){
    for(let j = 0 ; j< arr.length;j++){
      if(arr[j+1] < arr[j]){
        let temp = arr[j+1];
        arr[j+1] = arr[j];
        arr[j] = temp;
      }
    }
  }
  
  console.log(arr);
}

let arr = [8,5,9,10,2,1];
bubbleSort(arr);