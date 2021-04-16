
console.log('******************************');
console.log('Async/Await')
console.log('******************************');

// function getData() {
//     return 'Data Received';
//   }
// console.log(getData());


// async function getData() {
//     return 'Data Received';
//   }
// console.log(getData());


//async keyword with function always return promise
// async function getData() {
//     return 'Data Received';
//   }
// getData().then( data => console.log(data));


// async function getData() {
//     return 'Data Received';
//   }
// getData().then(console.log);


// let promise = new Promise( (resolve,reject) => {
//     setTimeout(() => {
//         resolve('Data Received')
//     }, 3000);
// })
// async function getData() {
//     let response = await promise;
//     console.log(response);
//   }
// getData();

dell ={
    brand:'Dell',
    hardDisk:'2 TB',
    color:'Black'
  }
  hp ={
    brand:'Hp',
    hardDisk:'2 TB',
    color:'Silver'
  }
  notAvailable ={
    brand:'Not Available',
    status:'Failed'
  }
//   Ex - 01: With Promise
  let buyLaptop = new Promise( (resolve, reject) =>{
      setTimeout(() => {
        resolve(dell)
      }, 3000);
  })

function fetch1() {
    document.getElementById('result1').innerText='Fetching Data...';
    buyLaptop.then(res => {
        console.log(res)
        document.getElementById('result1').innerText=JSON.stringify(res);
    })
}

// Ex - 02: With Async/Await
async function fetch2() {
    document.getElementById('result2').innerText='Fetching Data...';
   let data = await buyLaptop;
   console.log(data)
    //document.getElementById('result2').innerText=data; //getting [object Object]
    document.getElementById('result2').innerText=JSON.stringify(data);
}

let buyLaptop2 = fetch('https://jsonplaceholder.typicode.com/posts')
                 .then(response => response.json())

// function fetch3() {
//     document.getElementById('result3').innerText='Fetching Data...';
//     //promise
//     buyLaptop2.then(res=> {
//         console.log(res)
//         document.getElementById('result3').innerText=JSON.stringify(res);
//     });
// }

//async/await
async function fetch3() {
    document.getElementById('result3').innerText='Fetching Data...';
    //promise
   let data = await buyLaptop2;
   console.log(data);
    document.getElementById('result3').innerText=JSON.stringify(data);

}