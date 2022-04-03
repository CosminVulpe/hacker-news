console.log("test");


const init = async () => {
    console.log("async function")
    const request = await fetch('/api/top?page=1');
    const response = await request.json();
    // console.log(response);
}
init().then();


