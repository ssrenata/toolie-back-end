# toolie-back-end

Back end do aplicativo Toolie para a disciplina Resolução de Problemas II

## Esquema do banco de dados

Para a criação dessa API nos baseamos no seguinte esquema:
![Esquema do banco de dados](esquema-bd.jpeg)

## Endpoints
 
### *Entidade Usuario*

- GET /usuarios

Retorna todos os usuarios do banco de dados, incluindo todos os seus campos.

- GET /usuarios/{id}

Retorna os dados do usuário com o id especificado

### *Entidade Ferramenta*

- GET /ferramenta

Retorna todas as ferramentas do banco de dados, incluindo todos os seus campos.