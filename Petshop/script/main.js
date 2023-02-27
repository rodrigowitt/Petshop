let btn = document.querySelector("#buscar")
const nomeElemento = document.querySelector("#nome");
const tratamentoElemento = document.querySelector("#tratamento");
const statusElemento = document.querySelector("#status");
const responsavelElemento = document.querySelector("#responsavel");
const petContainer = document.querySelector("#pet-dados");
const errorMessageContainer = document.querySelector("#erro");



const hideInformacao = () => {
    errorMessageContainer.classList.add("hide");
    petContainer.classList.add("hide");
  
  };

  btn.addEventListener("click",(e)=> {
    const buscar = document.getElementById("busca-input").value
  if(buscar== ""){
    return;    
  }else{
    
    e.preventDefault();
    hideInformacao();
    url = `http://localhost:8080/petshop/${buscar}`
   
    fetch(url).then(response => {  
      return response.json()
     }).then(body =>{
       if (body.id == null){
            errorMessageContainer.classList.remove("hide")
            return;
          }  
         
        nomeElemento.innerText = body.nome;
        tratamentoElemento.innerText = body.tratamento;
        statusElemento.innerText = body.statusTratamento;
        responsavelElemento.innerText = body.responsavel;
        petContainer.classList.remove("hide");
        
      })
    }
     
})

