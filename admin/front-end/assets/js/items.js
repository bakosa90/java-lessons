var items;
$( document ).ready(function() {
    getItems();
});

function getItems() {
    $.ajax({
        url: "http://localhost:8000/getitems",
        type: "GET",
        beforeSend: function(request) {
            request.setRequestHeader("Authorization", localStorage.getItem("token"));
        },
        success: function(data) {
            console.log(JSON.parse(data));
        },
        error: function(err) {
            alert(err.responseText);
        }
    });
}