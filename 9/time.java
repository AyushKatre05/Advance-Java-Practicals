<%@ page import="java.util.*, java.text.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Current Date, Day, and Time</title>
</head>
<body>
    <h2>Current Date, Day, and Time</h2>

    <%
        // Get current date and time
        Date now = new Date();

        // Format date and time
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");

        String date = dateFormat.format(now);
        String time = timeFormat.format(now);
        String day = dayFormat.format(now);
    %>

    <p><strong>Date:</strong> <%= date %></p>
    <p><strong>Day:</strong> <%= day %></p>
    <p><strong>Time:</strong> <%= time %></p>
</body>
</html>
