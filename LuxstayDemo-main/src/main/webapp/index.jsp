<html>
<head>
    <link href="./style.css" rel="stylesheet" >
</head>
<body>
    <div class="container">
        <div class="wrap-add-button">
            <button id="add-button" class="add-button">Add Member</button>
        </div>
        <table id="table">

        </table>
    </div>

    <div id="myModalAdd" class="modal">
        <div class="modal-content">
            <span class="close">&times;</span>
            <div>
                <label for="add-name">Name:</label>
                <input type="text" id="add-name" name="add-name" placeholder="Your name..">

                <label for="add-age">Age:</label>
                <input type="text" id="add-age" name="add-age" placeholder="Your Age..">

                <label for="add-phone-number">Phone Number:</label>
                <input type="text" id="add-phone-number" name="add-phone-number" placeholder="Your Phone Number..">

                <label for="add-address">Address</label>
                <input type="text" id="add-address" name="add-address" placeholder="Your Address..">

                <input type="button" value="Add Member" class="add-button" onclick="addUser()">
            </div>
        </div>
    </div>

    <div id="myModalEdit" class="modal">
        <div class="modal-content">
            <span class="close">&times;</span>
            <div>
                <label for="edit-id">Id:</label>
                <input type="text" id="edit-id" name="edit-id" placeholder="Your ID..">

                <label for="edit-name">Name:</label>
                <input type="text" id="edit-name" name="edit-name" placeholder="Your name..">

                <label for="edit-age">Age:</label>
                <input type="text" id="edit-age" name="edit-age" placeholder="Your Age..">

                <label for="edit-phone-number">Phone Number:</label>
                <input type="text" id="edit-phone-number" name="edit-phone-number" placeholder="Your Phone Number..">

                <label for="edit-address">Address</label>
                <input type="text" id="edit-address" name="edit-address" placeholder="Your Address..">

                <input type="button" value="Edit Member" class="edit-button" onclick="submitEdit()">
            </div>
        </div>
    </div>

<script src="./script.js">
</script>
</body>
</html>
