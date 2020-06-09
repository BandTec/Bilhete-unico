const express = require("express");
const router = express.Router();
const tableEmpresa = require("../tables/empresa");

router.get("/cadastro", (req, res) => {
  res.render("cadastro-empresa");
});

router.post("/cadastrar", async (req, res) => {
  try {
    let data = req.body;
    await tableEmpresa.create(data);
    console.log(`Registro criado: ${data}`);
    return res.status(200).send("Empresa cadastrada com sucesso!");
  } catch (error) {
    res.send(error);
  }
})




router.post("/logar", async (req, res) => {

  try {
    let { email, senha } = req.body;
    let resposta = await tableEmpresa.findAll({
      where: {
        email: email,
        senha: senha
      }

    });
    let empresa = resposta[0].dataValues;

    if (empresa) {
      res.send(empresa);
    }

  } catch (error) {
    res.send(error);
  }
})




module.exports = router;