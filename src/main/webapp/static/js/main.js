console.log("test");


const getInfo = async () => {
    console.log("async function")
    const request = await fetch('api/top?page=1');
    const res = await request.json();
    console.log(res);
}
getInfo().then(r => console.log(r));


