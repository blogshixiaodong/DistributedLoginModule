
function loginCheck(username, password) {
    if(isNullOrEmpty(username) || isNullOrEmpty(password)) {
        return false;
    }
    return true;
}