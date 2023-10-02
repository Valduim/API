const express = require('express');
const app = express();
const port = 5050;

app.use(express.static(__dirname));

// Define una ruta de inicio
app.get('/', (req, res) => {
  res.sendFile(__dirname + '/index.html');
});

console.log(__dirname);

// Iniciar el servidor
app.listen(port, () => {
  console.log("Servidor web escuchando en el puerto ${port}");
});

