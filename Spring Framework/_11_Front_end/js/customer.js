$(document).ready(function () {

    //Add Customer
    $('#addCustomerBtn').click(function () {
        $.ajax({
            url: "http://localhost:8080/Back_End/customer/add",
            method: "POST",
            contentType: "application/json",
            data: JSON.stringify({
                "id": $('#id').val(),
                "name": $('#name').val(),
                "age": $('#age').val(),
                "address": $('#address').val()
            }),
            success: (res) => {
                if (res){
                    alert("Customer Added Successfully!")
                    $('#getAllCustomersBtn').click()
                    return
                }
                alert("Failed to add Customer!")
            },
            error: (err) => {
                alert("Something went wrong!")
                console.log(err)
            }
        })
    });

    //get All Customers
    $('#getAllCustomersBtn').click(function () {
        $.ajax({
            url: "http://localhost:8080/Back_End/customer/getAll",
            method: "GET",
            success: (res) => {
                let table = $('#customer-table');
                table.empty();
                res.forEach((customer) => {
                    table.append(`
                        <tr>
                            <td>${customer.id}</td>
                            <td>${customer.name}</td>
                            <td>${customer.age}</td>
                            <td>${customer.address}</td>
                        </tr>
                    `);
                });
            },
            error: (err) => {
                alert("Something went wrong!")
                console.log(err)
            }
        })
    });

    //Delete Customer
    $('#deleteCustomerBtn').click(function () {
        //Check if the ID is empty
        if ($('#id').val() === ""){
            alert("Please enter the Customer ID!")
            return
        }

        $.ajax({
            url: "http://localhost:8080/Back_End/customer/delete?id=" + $('#id').val(),
            method: "DELETE",

            success: (res) => {
                if (res){
                    alert("Customer Deleted Successfully!")
                    $('#getAllCustomersBtn').click()
                    return
                }
                alert("Failed to delete Customer!")
            },
            error: (err) => {
                alert("Something went wrong!")
                console.log(err)
            }
        })
    });

    //Update Customer
    $('#updateCustomerBtn').click(function () {
        $.ajax({
            url: "http://localhost:8080/Back_End/customer/update",
            method: "PUT",
            contentType: "application/json",
            data: JSON.stringify({
                "id": $('#id').val(),
                "name": $('#name').val(),
                "age": $('#age').val(),
                "address": $('#address').val()
            }),
            success: (res) => {
                if (res){
                    alert("Customer Updated Successfully!")
                    $('#getAllCustomersBtn').click()
                    return
                }
                alert("Failed to update Customer!")
            },
            error: (err) => {
                alert("Something went wrong!")
                console.log(err)
            }
        })
    });


    //Init customers table when page loads
    $('#getAllCustomersBtn').click()
});