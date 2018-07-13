import React, { Component } from 'react';


class Transaction extends Component {
    render(){
        const transactions = this.props.transactions;

        const transactionsArray = transactions.map(transaction => {
            return (
                <div>
                    Reference: {transaction.reference} &nbsp;
                    Type: {transaction.type} &nbsp;
                    Value: {transaction.value} &nbsp;
                    Time: {transaction.time}
                </div>

            );
        });

        console.log(transactions.length);
        return (
            <div>
                {this.props.couldFetchTransactions ?
                    (transactions.length !== 0) ?
                        <React.Fragment>
                            {transactionsArray}
                        </React.Fragment>
                        :
                        <span>
                            No transactions to show.
                        </span>
                    :
                    (transactions.length !== 0) ?
                        <span>
                            Invalid Iban
                        </span>
                        :
                        <span>
                            Bank Server Down
                        </span>
                }
            </div>
        )

    }
}

export default Transaction;