import fetch from 'unfetch';

const checkStatus = response => {
    if (response.ok) {
        return response;
    }
    //convert non-2xx HTTP responses into errors
    const error = new Error(response.statusText);
    error.response = response;
    return Promise.reject(error);
}
/*
export const getAllGifts = () =>
    fetch("api/v1/Gifts/all")
        .then(checkStatus);


export const getParentsGifts = () =>
    fetch("api/v1/Gifts/parents")
        .then(checkStatus);

*/
export const getGiftByCategory = (giftCategory) =>
    fetch(`api/v1/Gifts/${giftCategory}`)
        .then(checkStatus);
