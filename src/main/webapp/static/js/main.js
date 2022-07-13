let pageNews = 1;
let pageNewest = 1;
let pageJobs = 1;

const pageNewsMax = 10;
const pageNewestMax = 10;

const topNews = document.querySelector('#top-news-header');
const newest = document.querySelector('#newest-header');
const jobs = document.querySelector('#jobs-header');


const getInfo = async (fetchUrl, divQuery, page) => {
    const divMain = document.querySelector(divQuery);
    let result = "";
    const request = await fetch(fetchUrl + page);
    const res = await request.json();
    for (let i = 0; i < res.length; i++) {
        result += '<div class="card" >' + '<p>' + `<a href='${res[i]['url']}' target='_blank' class='title'>` + res[i]['title'] + '</a>' + '</p>';
        result += '<br>';
        result += '<p>' + res[i]['time_ago'] + '</p>';
        result += '<br>';
        result += '<p>' + res[i]['user'] + '</p>' + '</div>';
    }
    divMain.innerHTML = result;
}

const deletePreviousDiv = (divDelete) => {
    const div = document.querySelector(divDelete);
    div.innerHTML = '';
}


const pagination = (pageMax) => {
    const div = document.querySelector('#pagination');
    let result = "";
    if (pageMax !== 1) {
        for (let i = 1; i < pageMax + 1; i++) {
            result += `<a href='#' class='number' data-page='${i}'>${" " + i + " "}</a>`
        }
    } else {
        result += `<a href='#' class='number' data-page='${pageMax}'>${" " + pageMax + " "}</a>`
    }
    div.innerHTML = `
        <a href='#' class='icon-pagination-left'>&laquo;</a>` +
        result +
        `<a href='#' class='icon-pagination-right'>&raquo;</a>`;
}

const choosePage = (fetchUrl, divQuery, pageStart) => {
    let pageSelected = false;
    const number = document.querySelectorAll('.number');
    number.forEach(num => {
        num.addEventListener('click', () => {
            pageSelected = true;
            pageStart = num.innerHTML;
            getInfo(fetchUrl, divQuery, pageStart.trim()).then();
        })
    });
    if (pageSelected === false) {
        getInfo(fetchUrl, divQuery, pageStart).then();
    }

}


const init = async () => {
    // START INDEX
    pagination(pageNewsMax);
    choosePage("/api/top?page=", '#news', pageNews);

    topNews.addEventListener('click', () => {
        deletePreviousDiv('#newest');
        deletePreviousDiv('#jobs');
        pagination(pageNewsMax);
        choosePage("/api/top?page=", '#news', pageNews)
    });


    newest.addEventListener('click', () => {
        deletePreviousDiv('#news');
        deletePreviousDiv('#jobs');
        pagination(pageNewestMax);
        choosePage("/api/newest?page=", '#newest', pageNewest);
    });


    jobs.addEventListener('click', () => {
        deletePreviousDiv('#news');
        deletePreviousDiv('#newest');
        pagination(pageJobs);
        getInfo("/api/jobs?page=", '#jobs', pageJobs);
    });
}
init().then()


