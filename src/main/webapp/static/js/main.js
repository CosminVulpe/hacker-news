console.log("test");
let page = 1;


const getInfo = async () => {
    const divMain = document.querySelector("#top-news");
    let result = "";
    const request = await fetch('/api/top?page=' + page);
    const res = await request.json();
    console.log(res)
    for (let i = 0; i < res.length; i++) {
        result += '<div class="card" >' + '<p>' + `<a href='${res[i]['url']}'>` + res[i]['title'] + '</a>' + '</p>';
        result += '<br>';
        result += '<p>' + res[i]['time_ago'] + '</p>';
        result += '<br>';
        result += '<p>' + res[i]['user'] + '</p>' + '</div>';
    }
    divMain.innerHTML = result;
}


const init = async () => {
    getInfo();
}
init().then()


