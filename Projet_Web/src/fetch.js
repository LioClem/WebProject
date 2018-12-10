export const get = url => fetch(url,{
  method: 'GET',
  headers: {
    'Access-Control-Allow-Origin': '*',
  },
}
)

export const post = (url, data) =>
  fetch(url, {
    method: 'POST',
    body: JSON.stringify(data),
    headers: {
      'Content-Type': 'application/json; charset=utf-8',
      'Access-Control-Allow-Origin': '*',
    },
  })

export const put = (url, data) =>
  fetch(url, {
    method: 'PUT',
    body: JSON.stringify(data),
    headers: {
      'Content-Type': 'application/json; charset=utf-8',
      'Access-Control-Allow-Origin': '*',
    },
  })

export const del = url => fetch(url, { method: 'DELETE' })