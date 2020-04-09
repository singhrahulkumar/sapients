function selectionSort(arr){
  for(let i =0;i< arr.length;i++){
    for(let j = i+1 ; j< arr.length;j++){
      if(arr[j] < arr[i]){
        let temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
  }
  
  console.log(arr);
}

let arr = [8,5,9,10,2,1];
selectionSort(arr);