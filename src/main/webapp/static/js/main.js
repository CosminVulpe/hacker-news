let pageNews = 1;
let pageNewest = 1;
let pageJobs = 1;
const topNews = document.querySelector('#top-news-header');
const newest = document.querySelector('#newest-header');
const jobs = document.querySelector('#jobs-header');


const getInfo = async (fetchUrl, divQuery, page) => {
    const divMain = document.querySelector(divQuery);
    let result = "";
    const request = await fetch(fetchUrl + page);
    const res = await request.json();
    for (let i = 0; i < res.length; i++) {
        result += '<div class="card" >' + '<p>' + `<a href='${res[i]['url']}' target='_blank'>` + res[i]['title'] + '</a>' + '</p>';
        result += '<br>';
        result += '<p>' + res[i]['time_ago'] + '</p>';
        result += '<br>';
        result += '<p>' + res[i]['user'] + '</p>' + '</div>';
    }
    divMain.innerHTML = result;
}

const deletePreviousDiv = (divDelete) => {
    const div = document.querySelector(divDelete);
    // div.style("<i class='fa fa-spinner fa-pulse fa-3x fa-fw'</i>");
    div.innerHTML = '';

}

const init = async () => {
    await getInfo("/api/top?page=", '#news', pageNews)
    topNews.addEventListener('click', () => {
        deletePreviousDiv('#newest');
        deletePreviousDiv('#jobs');
        getInfo("/api/top?page=", '#news', pageNews)
    });
    newest.addEventListener('click', () => {
        deletePreviousDiv('#news');
        deletePreviousDiv('#jobs');
        getInfo("/api/newest?page=", '#newest', pageNewest)
    })
    jobs.addEventListener('click', () => {
        deletePreviousDiv('#news');
        deletePreviousDiv('#newest');
        getInfo("/api/jobs?page=", '#jobs', pageJobs);
    })
}
init().then()


