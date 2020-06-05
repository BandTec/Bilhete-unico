// Módulos
const handlebars = require('express-handlebars');
const bodyParser = require("body-parser");
const routesAdmin = require("./routes/admin");
const PORT = process.env.PORT || 3000;
const express = require("express");
const path = require("path");
const app = express();

//Middlewares;
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());
app.engine('handlebars', handlebars({ defaultLayout: 'main' }));
app.set('view engine', 'handlebars');
app.use(express.static(path.join(__dirname + "/public")));
app.use(routesAdmin);

// Rota Principal
app.get("/", (req, res) => {
  return res.render('index')
});

// Subindo servidor
app.listen(PORT, () => {
  console.log(`Servidor rodando na porta: ${PORT}`);
});