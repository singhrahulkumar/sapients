function binarySearch(arr,search){
  let left = 0,right = arr.length - 1, mid;
  
  while(left <= right){
    mid = Math.floor((left+right)/2);
    console.log(mid,left,right);
    if(arr[mid] == search){
      console.log("found at index",mid);
      return;
    } else {
      if(search >arr[mid]){
        left = mid+1;
      } else {
        right = mid -1;
      }
    }
  }
  
  console.log("not found");
}

let arr = [2,5,7,11,12,15,20,30,34,36];
binarySearch(arr,34);