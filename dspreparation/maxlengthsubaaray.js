function maxSubArraySum(arr){
  let maxSum =0,sum=0,fi=0,li=0,s=0;
  
  for(let i =0;i < arr.length;i++){
    sum += arr[i];
    console.log(sum,arr[i]);
      if(sum > maxSum){
      maxSum = sum;
        li = i;
        fi = s;
      }
     if(sum < 0){
      sum = 0;
       s = i+1;
      }
  }
  console.log(maxSum,fi,li);
}

let arr = [2,4,-8,-1,8,9];
maxSubArraySum(arr);